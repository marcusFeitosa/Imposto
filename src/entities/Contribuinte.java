package entities;

public class Contribuinte {
	private double RendaSalario;
	private double RendaServicos;
	private double RendaGanhoCapital;
	private double GastosMedicos;
	private double GastosEducacao;
	
	public Contribuinte() {
		
	}
	
	public Contribuinte(double rendaSalario, double rendaServicos, double rendaGanhoCapital, double gastosMedicos,
			double gastosEducacao) {
		RendaSalario = rendaSalario;
		RendaServicos = rendaServicos;
		RendaGanhoCapital = rendaGanhoCapital;
		GastosMedicos = gastosMedicos;
		GastosEducacao = gastosEducacao;
	}

	// getters and setters
	public double getRendaSalario() {
		return RendaSalario;
	}

	public void setRendaSalario(double rendaSalario) {
		RendaSalario = rendaSalario;
	}

	public double getRendaServicos() {
		return RendaServicos;
	}

	public void setRendaServicos(double rendaServicos) {
		RendaServicos = rendaServicos;
	}

	public double getRendaGanhoCapital() {
		return RendaGanhoCapital;
	}

	public void setRendaGanhoCapital(double rendaGanhoCapital) {
		RendaGanhoCapital = rendaGanhoCapital;
	}

	public double getGastosMedicos() {
		return GastosMedicos;
	}

	public void setGastosMedicos(double gastosMedicos) {
		GastosMedicos = gastosMedicos;
	}

	public double getGastosEducacao() {
		return GastosEducacao;
	}

	public void setGastosEducacao(double gastosEducacao) {
		GastosEducacao = gastosEducacao;
	}
	
	//metodos
	public double ImpostoSal() {
		double salMensal=RendaSalario/12;
		if(salMensal<3000.0)
			return 0;
		else if (salMensal<=5000.0) 
			return RendaSalario*0.1;
		else 
			return RendaSalario*0.2;
	
	}
	
	public double ImpostoServicos() {
		return RendaServicos*0.15;
	}
	
	public double ImpostoGanhoDeCapital() {
		return RendaGanhoCapital*0.20;
	}
	
	public double ImpostoBruto() {
		return ImpostoSal()+ImpostoServicos()+ImpostoGanhoDeCapital();
	}
	
	public double MaximoDedutivel() {
		return ImpostoBruto()*0.3;
	}
	
	public double GastosDedutiveis() {
		return GastosMedicos+GastosEducacao;
	}
	
	public double Abatimento() {
		if(GastosDedutiveis()<MaximoDedutivel())
			return GastosDedutiveis();
		else return MaximoDedutivel();
	}
	
	public String ConsolidadoDeRenda() {
		return "CONSOLIDADO DE RENDA:\n"+
				"Imposto sobre salário: "+String.format("%.2f",ImpostoSal())+"\n"+
		        "Imposto sobre serviços: "+String.format("%.2f",ImpostoServicos())+"\n"+
				"Imposto sobre ganho de capital: "+String.format("%.2f",ImpostoGanhoDeCapital())+"\n\n"
				;
	}
	
	public String Deducoes() {
		return "DEDUCOES:\n"+
	           "Máximo dedutível: "+String.format("%.2f",MaximoDedutivel())+"\n"+
				"Gastos dedutiveis: "+String.format("%.2f",GastosDedutiveis())+"\n\n"
				;
	}
	
	public String Resumo() {
		return "RESUMO:\n"+
		           "Imposto Bruto Total: "+String.format("%.2f",ImpostoBruto())+"\n"+
					"Abatimento: "+String.format("%.2f",Abatimento())+"\n"+
		            "Imposto devido: "+String.format("%.2f",ImpostoBruto()-Abatimento())
					;
	}
	
	public String Relatorio() {
		return "RELATÓRIO DE IMPOSTO DE RENDA\n\n"+
                ConsolidadoDeRenda()+
                Deducoes()+
                Resumo()
				;
	           
	}
	
	
	
	
	
	

}
