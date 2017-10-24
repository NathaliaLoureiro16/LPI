package br.fundatec.lp1.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.fundatec.lp1.devices.Alarm;
/**
 * Classe que faz a conexão com o Banco de dados.
 * Possui as funções para adicionar no banco os dados gerados.
 * @author Nathalia
 *
 */
public class AlarmDao {
	private Connection con;

	public AlarmDao(Connection con) {
		this.con = con;

	}

	public void add(Alarm alarm) {
		String sql = "INSERT INTO alarm (status,ringing,change_time) VALUES (?,?,now())";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setBoolean(1, alarm.deviceData());
			stmt.setBoolean(2, alarm.isRinging());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("Alarm Insert Error: " + e);
		}

	}

	public List<AlarmJB> getLista() {
		List<AlarmJB> alarms = new ArrayList<AlarmJB>();

		String sql = "SELECT * FROM alarm";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				AlarmJB alarm = new AlarmJB();
				alarm.setId(rs.getLong("id"));
				alarm.setBol_status(rs.getBoolean("status"));
				alarm.setRinging(rs.getBoolean("ringing"));
				
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("change_time"));
				alarm.setChange_time(data);
				alarms.add(alarm);
			}
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alarms;

	}

}
