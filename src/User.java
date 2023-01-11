public class User {
  private String name;
  private String cpf;
  private String email;
  private Plan plan = new Plan();

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getcpf() {
    return this.cpf;
  }

  public String getEmail(){
    return this.email;
  }
  public void setEmail(String email){
    this.email = email;
  }

  public String getPlanType(){
    return this.plan.getType();
  }
  public double getPlanValue(){
    return this.plan.getValue();
  }
  public void setPlan(String type, double value){
    plan.setType(type);
    plan.setValue(value);
  }

}
