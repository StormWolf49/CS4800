class DispensingSnackState implements StateOfVendingMachine {
    private String selectedSnack;

    public DispensingSnackState(String selectedSnack) {
        this.selectedSnack = selectedSnack;
    }

    @Override
    public void selectSnack(String snackName, VendingMachine vendingMachine) {
        System.out.println("Please wait, snack is being dispensed.");
    }

    @Override
    public void insertMoney(double money, VendingMachine vendingMachine) {
        System.out.println("Please wait, snack is being dispensed.");
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        vendingMachine.getSnack(selectedSnack);
    }
}