# How to start
  You can run this application with IDE. Open any IDE i used IntelliJ but any IDE should work. Import project and just run main method which is in Main class. When it’s run you should see some sample data in terminal.
  Alternatively you can run MarketStore.bat file with double click that will run PayDesk.jar file in terminal This file is in PayDeskRunnable directory.

# How it works
  There are six classes in my solution. Card is parent(super) class of BronzeCard, SilverCard and GoldCard classes. This class is abstract because it has abstract method. I override that method in children classes because there are tree types of cards, and for every card there is different calculation for a discount rate.
  All other calculations are done in PayDesk class which is abstract because all methods in it are static. The discountRate, discount and total methods are used for calculations and printPurchaseInfo method is used for outputting the results in terminal.
  Main class contains main method where I instantiate bronze, silver and gold card objects and pass them a last month turn over.For every object I call printPurchaseInfo method from PayDesk calss which arguments are that card object and purchase value. There is a one more method, waitBeforeExit, in Main class and its job is to ask user for input before the program ends.
