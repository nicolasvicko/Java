package sessao11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcData {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26z");

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);

		System.out.println("Data atual: " + d04);
		System.out.println("Semana Passada: " + pastWeekLocalDate);
		System.out.println("Semana que vem: " + nextWeekLocalDate);

		System.out.println("-------------------------------------");
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

		System.out.println("Data atual: " + d05);
		System.out.println("Semana Passada: " + pastWeekLocalDateTime);
		System.out.println("Semana que vem: " + nextWeekLocalDateTime);

		System.out.println("-------------------------------------");

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

		System.out.println("Data atual: " + d05);
		System.out.println("Semana Passada: " + pastWeekInstant);
		System.out.println("Semana que vem: " + nextWeekInstant);

		System.out.println("-------------------------------------");

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("t1 dias = " + t1.toDays());

		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("t2 dias = " + t2.toDays());
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("t3 dias = " + t3.toDays());
		
		Duration t4 = Duration.between(d06, pastWeekInstant);
		System.out.println("t4 dias = " + t4.toDays());
	}

}
