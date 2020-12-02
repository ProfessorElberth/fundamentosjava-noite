package testes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataHoraTeste {

	public static void main(String[] args) {
		DateTimeFormatter formatoDataIn = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
		DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String minhaData = "12/31/2020";//"2020-12-31";
		
		LocalDate dataFimDeAno = LocalDate.parse(minhaData, formatoDataIn);
		System.out.println("1) Data Fim de Ano: " + dataFimDeAno.format(formatoData));
		
		LocalDate data = LocalDate.of(1978, 8, 24);
		System.out.println("2) Data: " + data.format(formatoData));
		System.out.println("2) Data: " + data.plusDays(10).format(formatoData));
		System.out.println("2) Data: " + data.minusDays(20).format(formatoData));
		
		LocalTime hora = LocalTime.of(19, 40);
		System.out.println("3) Hora: " + hora.format(formatoHora));
		
		LocalDateTime dataHora = LocalDateTime.of(2020, Month.NOVEMBER, 29, 14, 45);
		System.out.println("4) DataHora: " + dataHora.format(formatoDataHora));

		LocalDate hoje = LocalDate.now();
		System.out.println("Hoje: " + hoje.format(formatoData));
		
		System.out.println(Period.between(data, hoje).getYears());
		System.out.println(Period.between(data, hoje).getMonths());
		System.out.println(Period.between(data, hoje).getDays());
	}
}
