class VendingMachine {
    private SnackDispenseHandler snacks;
    private double moneyInserted;
    private StateOfVendingMachine currentState;

    public VendingMachine(SnackDispenseHandler snacks) {
        this.snacks = snacks;
        this.currentState = new IdleState();
    }

    public void getSnack(String name) {
        snacks.dispenseSnack(name, this);
    }

    public void setCurrentState(StateOfVendingMachine state) {
        this.currentState = state;
    }

    public void setMoneyInserted(double moneyInserted) {
        this.moneyInserted = moneyInserted;
    }

    public double getMoneyInserted() {
        return moneyInserted;
    }

    public void selectSnack(String snackName) {
        currentState.selectSnack(snackName, this);
    }

    public void insertMoney(double money) {
        currentState.insertMoney(money, this);
    }

    public void dispenseSnack() {
        currentState.dispenseSnack(this);
    }
}