package bilboteca;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Principal extends JFrame implements ActionListener{
	Container c;
	JMenuBar barra;
	JMenu menuLivro;
	JMenuItem cadastro;
	JDesktopPane painel;
	Color corFundo;
	
	void instanciarcomponentes() {
		barra = new JMenuBar();
		menuLivro = new JMenu("Biblioteca");
		cadastro = new JMenuItem("Livros");
		painel = new JDesktopPane();
		corFundo = new Color(37, 57, 67);
	}
	
	void atribuirvalores() {
		setSize(1024,780);
		setJMenuBar(barra);
		painel.setBackground(corFundo);
		cadastro.addActionListener(this);
	}
	
	void montartela() {
		menuLivro.add(cadastro);
		barra.add(menuLivro);
		setVisible(true);
		add(painel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cadastro) {
		Biblioteca b = new Biblioteca();
		painel.add(b);
		b.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.instanciarcomponentes();
		p.atribuirvalores();
		p.montartela();
	}


}