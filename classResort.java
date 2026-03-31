class Resort {
    int RNo, Days;
    String Name;
    float Charges;

    float Compute() {
        float amt = Days * Charges;
        if (amt > 11000)
            amt = 1.02f * amt;
        return amt;
    }

    void Getinfo(int r, String n, float c, int d) {
        RNo = r; Name = n; Charges = c; Days = d;
    }

    void DispInfo() {
        System.out.println(RNo + " " + Name + " " + Charges + " " + Days + " " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo(1, "Asha", 2000, 6);
        r.DispInfo();
    }
}