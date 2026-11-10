public class Aluno implements Comparable<Aluno> {
    String nome;
    int matricula;

    public Aluno (String nome,int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }



    public String getNome() {
        return this.nome;
    }
    public int getMatricula() {
        return this.matricula;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



    @Override
    public int compareTo(Aluno outro) {
    return Integer.compare(this.matricula, outro.matricula);
    }
    
    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Aluno)) {
        return false;
    }

    Aluno outro = (Aluno) obj;

    return this.matricula == outro.matricula;
    }


    @Override
    public String toString() {
    return "[Matrícula: " + matricula + " - Nome: " + nome + "]";
}           
}