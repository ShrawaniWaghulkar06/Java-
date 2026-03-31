interface Bank {
    float getInterestRate();
}

class SBI implements Bank {
    public float getInterestRate() { return 6.5f; }
}

class HDFC implements Bank {
    public float getInterestRate() { return 7.0f; }
}

class ICICI implements Bank {
    public float getInterestRate() { return 7.5f; }
}

class Main {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println(b1.getInterestRate());
        System.out.println(b2.getInterestRate());
        System.out.println(b3.getInterestRate());
    }
}