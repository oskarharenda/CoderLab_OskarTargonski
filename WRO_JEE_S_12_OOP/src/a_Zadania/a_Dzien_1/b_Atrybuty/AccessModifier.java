package a_Zadania.a_Dzien_1.b_Atrybuty;

public class AccessModifier {
    public String publicAtribute;
    private String privateAtribute;
    protected String protectedAtribute;
    String defaultAtribute;
    public String getPrivateAtribute(){
        return privateAtribute;
    }

    public void setPrivateAtribute(String privateAtribute){
        this.privateAtribute = privateAtribute;
    }
}
