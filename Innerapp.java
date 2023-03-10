package OOP_final;

public class Innerapp {
    IInterface v;

    public Innerapp(IInterface v) {
      this.v = v;
    }
  
    void write() {
      v.print();
    }
}
