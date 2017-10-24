package br.fundatec.lp1.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.fundatec.lp1.devices.Light;
/**
 * Classe que faz a conexão com o Banco de dados.
 * Possui as funções para adicionar no banco os dados gerados.
 * @author Nathalia
 *
 */
public class LightDao {
	private Connection con;

	public LightDao(Connection con) {
		this.con = con;

	}

	public void add(Light light) {
		String sql = "INSERT INTO light (status,change_time) VALUES (?,now())";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setBoolean(1, light.deviceData());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("light Insert Error: " + e);
		}

	}

	public List<LightJB> getLista() {
		List<LightJB> lights = new ArrayList<LightJB>();

		String sql = "SELECT * FROM light";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				LightJB light = new LightJB();
				light.setId(rs.getLong("id"));
				light.setBol_status(rs.getBoolean("status"));

				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("Change_time"));
				light.setChange_time(data);
				lights.add(light);
				
			}
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lights;

	}

}