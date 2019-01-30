package com.thoughtworks.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private String name = "john";
    private Customer customer = new Customer("john");
    private Rental rental = new Rental(new Movie("NewMovie",2),10);
    @Test
    public void shouldGenerateTextStatement(){
        customer.addRental(rental);
       assertEquals("Rental Record for " + name + "\n\t"+"NewMovie"+"\t12.0"+"\nAmount owed is " + "12.0" + "\n"+"You earned " +1
               + " frequent renter points",customer.statement());
    }

    @Test
    public void shouldReturnNameAsJohn() {
        assertEquals(name,customer.getName());
    }

    @Test
    public void shouldGenerateHtmlStatement() {
        customer.addRental(rental);
        assertEquals("<h1>Rental Record for <b>" + name + "</b></h1><br/>"+"NewMovie"+"12.0"+"<br/>Amount owed is " + "<b>12.0</b>" + "<br/>"+"You earned " +"<b>1</b>"
                + " frequent renter points",customer.htmlStatement());
    }

}