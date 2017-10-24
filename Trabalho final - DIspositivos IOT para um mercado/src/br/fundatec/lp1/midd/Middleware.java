package br.fundatec.lp1.midd;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fundatec.lp1.database.AlarmDao;
import br.fundatec.lp1.database.AlarmJB;
import br.fundatec.lp1.database.ConnectionFactory;
import br.fundatec.lp1.database.LightDao;
import br.fundatec.lp1.database.LightJB;
import br.fundatec.lp1.database.MotionSensorDao;
import br.fundatec.lp1.database.MotionSensorJB;
import br.fundatec.lp1.devices.Alarm;
import br.fundatec.lp1.devices.Clock;
import br.fundatec.lp1.devices.Light;
import br.fundatec.lp1.devices.MotionSensor;

/**
 * Classe que faz a conexão entre os dispositivos e a aplicação.
 * @author Nathalia
 *
 */

public class Middleware {
	
	/**
	 * Método que ativa o sistema de segurança e desliga as luzes se for noite
	 * @return
	 * Uma mensagem se o sistema estão ligados ou não
	 * @throws SQLException
	 * Erro caso problema com o banco
	 */
	
	public String turnSecuritySystemOn() throws SQLException {
		Connection con = new ConnectionFactory().fabricate();
		Clock clock = new Clock();
		Alarm alarm = new Alarm();
		Light light = new Light();
		MotionSensor motion = new MotionSensor();

		AlarmDao aDao = new AlarmDao(con);
		LightDao lDao = new LightDao(con);
		MotionSensorDao mDao = new MotionSensorDao(con);

		if (clock.getHour().equals("Night")) {
			alarm.setDs_status(true);
			light.setBol_status(false);
			motion.setDs_status("On");
			aDao.add(alarm);
			lDao.add(light);
			mDao.add(motion);

			con.close();

			return "Good night, as of now, all security systems are on";
		}
		con.close();
		return "security systems are disabled";

	}
	/**
	 * Método que desativa o sistema de segurança e liga as luzes se for dia
	 * @return
	 * Uma mensagem se o sistema estão ligados ou não
	 * @throws SQLException
	 * Erro caso problema com o banco
	 */
	
	public String turnSecuritySystemOff() throws SQLException {
		Connection con = new ConnectionFactory().fabricate();
		Clock clock = new Clock();
		Alarm alarm = new Alarm();
		Light light = new Light();
		MotionSensor motion = new MotionSensor();

		AlarmDao aDao = new AlarmDao(con);
		LightDao lDao = new LightDao(con);
		MotionSensorDao mDao = new MotionSensorDao(con);

		if (clock.getHour().equals("Day")) {
			alarm.setDs_status(false);
			light.setBol_status(true);
			motion.setDs_status("Off");
			aDao.add(alarm);
			lDao.add(light);
			mDao.add(motion);

			con.close();
			return "Good morning, as of now, all security systems are off";

		}
		con.close();
		return "security systems are enable";
	}

	/**
	 * Método que envia aviso para a policia caso sensor de movimento ative
	 * @return
	 * Uma mensagem de que está chamando o carro de policia mais proximo ou que não a problemas
	 * @throws SQLException
	 * Erro caso problema com o banco
	 */
	public String callingPolice() throws SQLException {
		Clock clock = new Clock();
		Alarm alarm = new Alarm();
		MotionSensor motion = new MotionSensor();
		Connection con = new ConnectionFactory().fabricate();

		AlarmDao aDao = new AlarmDao(con);
		MotionSensorDao mDao = new MotionSensorDao(con);

		if (clock.getHour().equals("Night") && motion.isBol_detect()) {
			alarm.dingAlarm(true);
			aDao.add(alarm);
			mDao.add(motion);

			con.close();
			return "Calling the nearest police car";

		}
		con.close();
		return "N-N-No pro-problem here, ff-folks!";

	}

	/**
	 * Metodo que mostra os registros salvos nas tabelas de alarm, light e motion sensor.
	 * @throws SQLException
	 * Erro caso problema com o banco
	 */
	public void databaseRecords() throws SQLException {
		Connection con = new ConnectionFactory().fabricate();

		AlarmDao aDao = new AlarmDao(con);
		LightDao lDao = new LightDao(con);
		MotionSensorDao mDao = new MotionSensorDao(con);

		List<AlarmJB> ajbrecords = new ArrayList<AlarmJB>();
		ajbrecords = aDao.getLista();
		for (AlarmJB alarmJB : ajbrecords) {
			System.out.println("AlarmID: " + alarmJB.getId());
			System.out.println("Change time: " + alarmJB.getChange_time().getTime());
			System.out.println("Ringing: " + alarmJB.isRinging());
			System.out.println("Status: " + alarmJB.isBol_status());

			System.out.println("********************************");
		}
		List<LightJB> ljbrecords = new ArrayList<LightJB>();
		ljbrecords = lDao.getLista();
		for (LightJB lightJB : ljbrecords) {
			System.out.println("LightID: " + lightJB.getId());
			System.out.println("Change time: " + lightJB.getChange_time().getTime());
			System.out.println("Status: " + lightJB.isBol_status());

			System.out.println("********************************");
		}
		List<MotionSensorJB> mjbrecords = new ArrayList<MotionSensorJB>();
		mjbrecords = mDao.getLista();
		for (MotionSensorJB motionsensorJB : mjbrecords) {
			System.out.println("MotionSensorID: " + motionsensorJB.getId());
			System.out.println("Change time: " + motionsensorJB.getChange_time().getTime());
			System.out.println("Detecting: " + motionsensorJB.isDetecting());
			System.out.println("Status: " + motionsensorJB.getDs_status());

			System.out.println("********************************");
		}
		con.close();

	}

}