package com.thoughtworks.movierental;

public class Customer {
  private String name;
  private Rentals rentals = new Rentals();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    Rentals rentals = this.rentals;
    return new TextStatement().display(this.getName(), rentals);
  }

  public String htmlStatement() {
    String result = "<h1>Rental Record for <b>" + getName() + "</b></h1><br/>";
    for (Rental rental : rentals) {
      result +=   rental.getMovie().getTitle() +
              String.valueOf(rental.getAmount()) + "<br/>";
    }

    //add footer lines result
    result += "Amount owed is " +"<b>"+ String.valueOf(rentals.getTotalAmount())+"</b>" + "<br/>";
    result += "You earned " + "<b>"+String.valueOf(rentals.getTotalFrequentRenterPoints())+"</b>"
            + " frequent renter points";
    return result;
  }

}

