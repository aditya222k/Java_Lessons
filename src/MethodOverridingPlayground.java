
class Bank{
    String color="grey";
    double roi(){
        return 0;
    }
}


class SBI extends Bank{
    @Override
    double roi() {
        return 12.5;
    }
}
class ICICI extends Bank{
    @Override
    double roi() {
        return 13.5;
    }
}

class RBI extends Bank{
    String wallColor = super.color;
    @Override
    double roi() {
        return super.roi();
    }
}


public class MethodOverridingPlayground {
    public static void main(String[] args){
        SBI sbi=new SBI();
        System.out.println(sbi.roi());

        ICICI icici=new ICICI();
        System.out.println(icici.roi());

        RBI rbi =new RBI();
        System.out.println("rbi.color = " + rbi.color);
        System.out.println("rbi.roi() = " + rbi.roi());
    }
}
