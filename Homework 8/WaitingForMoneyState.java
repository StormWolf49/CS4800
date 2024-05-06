class WaitingForMoneyState implements StateOfVendingMachine {
    private String selectedSnack;

    public WaitingForMoneyState(String selectedSnack) {
        this.selectedSnack = selectedSnack;
    }

    @Override
    public void selectSnack(String snackName, VendingMachine vendingMachine) {
        System.out.println("Please wait, money is pending.");
    }

    @Override
    public void insertMoney(double money, VendingMachine vendingMachine) {
        vendingMachine.setMoneyInserted(money);
        vendingMachine.setCurrentState(new DispensingSnackState(selectedSnack));
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Please insert money first.");
    }
}