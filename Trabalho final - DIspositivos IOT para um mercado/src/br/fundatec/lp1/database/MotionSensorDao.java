package br.fundatec.lp1.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.fundatec.lp1.devices.MotionSensor;
/**
 * Classe que faz a conexão com o Banco de dados.
 * Possui as funções para adicionar no banco os dados gerados.
 * @author Nathalia
 *
 */
public class MotionSensorDao {
	private Connection con;

	public MotionSensorDao(Connection con) {
		this.con = con;

	}

	public void add(MotionSensor motion) {
		String sql = "INSERT INTO motion (status,detecting,change_time) VALUES (?,?,now())";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, motion.generateData());
			stmt.setBoolean(2, motion.isBol_detect());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("MotionSensor Insert Error: " + e);
		}

	}

	public List<MotionSensorJB> getLista() {
		List<MotionSensorJB> motions = new ArrayList<MotionSensorJB>();

		String sql = "SELECT * FROM motion";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				MotionSensorJB motion = new MotionSensorJB();
				motion.setId(rs.getLong("id"));
				motion.setDs_status(rs.getString("status"));
				motion.setDetecting(rs.getBoolean("detecting"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("change_time"));
				motion.setChange_time(data);
				motions.add(motion);
				
			}
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return motions;

	}

}

