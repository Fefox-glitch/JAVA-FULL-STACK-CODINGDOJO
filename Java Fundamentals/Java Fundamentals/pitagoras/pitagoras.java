import java.lang.Math;
public class pitagoras {

	public double calcularHipotenusa(int catetoA, int catetoB) {

		double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

		return Math.round(hipotenusa * 100d) / 100d;
	}

}