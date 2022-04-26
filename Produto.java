

class Produto{
  private String rotulo;
  private int qteMin;
  private int qteAtual;
  private int qteMax;
  private double valorUnit;

  Produto(){}
  
  Produto (String r, int min, int atual, int max, int vUnit){
    rotulo = r;
    qteMin = min;
    qteAtual = atual;
    qteMax = max;
    valorUnit = vUnit;
  }
  
  public String obtemRotulo() {
    return rotulo;
  }
  public void defineRotulo(String s){
    rotulo = s;
  }
  public int obtemQteMax(){
    return qteMax;
  }
  public void defineQteMax(int max){
    qteMax = max;
  }
  public int obtemQteMin(){
    return qteMin;
  }
  public void defineQteMin(int min){
    qteMin = min;
  }
  public int obtemQteAtual(){
    return qteAtual;
  }
  public void defineQteAtual(int atual){
    qteAtual = atual;
  }
  public double obtemValorUnit(){
    return valorUnit;
  }
  public void defineValorUnit(double vUnit){
    valorUnit = vUnit;
  }
  public boolean precisaReposicao(){
    if(qteAtual <= qteMin) return true;
    else return false;
  }
  String str(){
    return "Produto: " + rotulo + "\nQuantidade em estoque: " + qteAtual + "\nPrecisa de reposição? " + precisaReposicao();
  }
}