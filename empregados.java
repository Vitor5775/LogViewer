class empregados {
    private String nome, sobrenome, nome2, sobrenome2;
    private int salario_mensal, salario_mensal2;

    public empregados(String nome, String sobrenome, int salario_mensal, String nome2, String sobrenome2, int salario_mensal2) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario_mensal = salario_mensal;
        this.nome2 = nome2;
        this.sobrenome2 = sobrenome2;
        this.salario_mensal2 = salario_mensal2;
    }

    public String getNome() {
        return nome;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSobrenome2() {
        return sobrenome2;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSobrenome2(String sobrenome2) {
        this.sobrenome2 = sobrenome2;
    }

    public int getSalario_mensal() {
        return salario_mensal;
    }

    public int getSalario_mensal2() {
        return salario_mensal2;
    }

    public void setSalario_mensal(int salario_mensal) {
        this.salario_mensal = salario_mensal;
    }

    public void setSalario_mensal2(int salario_mensal2) {
        this.salario_mensal2 = salario_mensal2;
    }

    public double salario_anual() {
        return salario_mensal * 12;
    }

    public double salario_anual2() {
        return salario_mensal2 * 12;
    }

    public double aumento() {
        return salario_mensal * 1.1;
    }

    public double aumento2() {
        return salario_mensal2 * 1.1;
    }
}