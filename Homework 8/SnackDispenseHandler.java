class SnackDispenseHandler {
    private SnackDispenseHandler next;
    private Snack snack;

    public SnackDispenseHandler(Snack snack, SnackDispenseHandler next) {
        this.next = next;
        this.snack = snack;
    }

    public void dispenseSnack(String selectedSnack, VendingMachine vendingMachine) {
        if (selectedSnack.equals(typeName())) {
            if (snack != null && snack.getQuantity() > 0 && vendingMachine.getMoneyInserted() >= snack.getPrice()) {
                System.out.println("Dispensing " + selectedSnack);
                snack.decreaseQuantity(1);
                vendingMachine.setMoneyInserted(0);
                vendingMachine.setCurrentState(new IdleState());
            } else {
                System.out.println("Insufficient quantity or money. Returning money.");
                vendingMachine.setMoneyInserted(0);
                vendingMachine.setCurrentState(new IdleState());
            }
        } else {
            next.dispenseSnack(selectedSnack, vendingMachine);
        }
    }

    public Snack type() {
        return snack;
    }

    public String typeName() {
        return snack.getName();
    }
}