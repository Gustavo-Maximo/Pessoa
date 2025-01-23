public class Pessoa{
    
    private String nome;
    private Integer idade;
    private String sexo;
    private float altura;
    private float peso;
    
    public Pessoa (String nome, Integer idade, String sexo, float altura, float peso){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    
    public Integer getIdade(){
        return idade;
    }
    
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
        
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Altura: " + getAltura() + " m");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println();
    }
}