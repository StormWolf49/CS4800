class IdleState implements StateOfVendingMachine {
    @Override
    public void selectSnack(String snackName, VendingMachine vendingMachine) {
        System.out.println("Snack selected: " + snackName);
        vendingMachine.setCurrentState(new WaitingForMoneyState(snackName));
    }

    @Override
    public void insertMoney(double money, VendingMachine vendingMachine) {
        System.out.println("Please select a snack first.");
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Please select a snack first.");
    }
}