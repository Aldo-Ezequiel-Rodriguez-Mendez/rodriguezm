package fibonacciswing;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaFibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroInicial;
	private JTextField txtIncremento;
	private JTextField txtNumeroDeIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFibonacci frame = new VentanaFibonacci();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaFibonacci() {
		setTitle("Serie Fibonacci");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroInicial = new JLabel("Primero n\u00FAmero:");
		lblNumeroInicial.setBounds(24, 42, 114, 16);
		contentPane.add(lblNumeroInicial);
		
		JLabel lblNumeroDeIteraciones = new JLabel("N\u00FAmero de iteraciones:");
		lblNumeroDeIteraciones.setBounds(24, 119, 134, 16);
		contentPane.add(lblNumeroDeIteraciones);
		
		JLabel lblIncremento = new JLabel("Segundo n\u00FAmero:");
		lblIncremento.setBounds(24, 77, 114, 16);
		contentPane.add(lblIncremento);
		
		txtNumeroInicial = new JTextField();
		txtNumeroInicial.setBounds(132, 39, 116, 22);
		contentPane.add(txtNumeroInicial);
		txtNumeroInicial.setColumns(10);
		
		txtIncremento = new JTextField();
		txtIncremento.setColumns(10);
		txtIncremento.setBounds(132, 74, 116, 22);
		contentPane.add(txtIncremento);
		
		txtNumeroDeIteraciones = new JTextField();
		txtNumeroDeIteraciones.setColumns(10);
		txtNumeroDeIteraciones.setBounds(170, 116, 116, 22);
		contentPane.add(txtNumeroDeIteraciones);
		
		JComboBox cboSerie = new JComboBox();
		cboSerie.setBounds(132, 168, 167, 22);
		contentPane.add(cboSerie);
		
		JLabel lblSerie = new JLabel("Serie Fibonnaci:");
		lblSerie.setBounds(24, 171, 114, 16);
		contentPane.add(lblSerie);
		
		JButton btnMostrarSerie = new JButton("Mostrar serie");
		btnMostrarSerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int intPrimerNumero = 0, intIteraciones = 0, intSegundoNumero = 0, intSuma = 0, i = 1;
				
				intPrimerNumero = Integer.parseInt(txtNumeroInicial.getText());
				intIteraciones = Integer.parseInt(txtNumeroDeIteraciones.getText());
				intSegundoNumero = Integer.parseInt(txtIncremento.getText());
				
				cboSerie.removeAllItems();
							
				cboSerie.addItem(Integer.toString(intPrimerNumero)); 
				cboSerie.addItem(Integer.toString(intSegundoNumero));
				
				/*for(int i = intInicio;i < intFinal; i++)
				{												
					intSuma = intInicio + intIncremento;
					cboSerie.addItem(Integer.toString(intSuma));
						
					intInicio = intIncremento;
					intIncremento = intSuma;																			
				}*/	
				
				do 
				{
					i = i + 1;
					intSuma = intPrimerNumero + intSegundoNumero;
					cboSerie.addItem(Integer.toString(intSuma));
					
						
					intPrimerNumero = intSegundoNumero;
					intSegundoNumero = intSuma;		
				}while (i < intIteraciones);
			}
		});
		btnMostrarSerie.setBounds(151, 215, 142, 25);
		contentPane.add(btnMostrarSerie);
	}
}
