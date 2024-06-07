package coleccionesEnJava;

import java.util.Objects;
import java.util.Set;

class BoletaRifa {
    private int ticketNumero;
    private String titular;

    public BoletaRifa(int ticketNumero, String titular) {
        this.ticketNumero = ticketNumero;
        this.titular = titular;
    }

    public int getTicketNumber() {
        return ticketNumero;
    }

    public String getHolderName() {
        return titular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoletaRifa that = (BoletaRifa) o;
        return ticketNumero == that.ticketNumero || titular.equals(that.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketNumero, titular);
    }

    @Override
    public String toString() {
        return "Numero de Ticket = " + ticketNumero + ", Titular = " + titular;
    }
    
    public static void addTicket(Set<BoletaRifa> bingoTickets, BoletaRifa newTicket) {
        if (bingoTickets.contains(newTicket)) {
            System.out.println("Ticket no agregado. Campos duplicados: " + newTicket);
        } else {
            bingoTickets.add(newTicket);
            System.out.println("Ticket agergado: " + newTicket);
        }
    }
}
