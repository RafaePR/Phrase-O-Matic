import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Application extends JFrame implements ActionListener {
	
	JButton buttonGeneratePTBR, buttonGenerateEN, buttonBack;
	
	String[] wordsPTBR1 = {"programadores", "softwares", "estudantes", "professores", "códigos", 
			"cachorros", "gatos", "pássaros", "robôs", "cadeiras", "mesas", "capivaras", "máquinas", 
			"celulares", "bairros", "policiais", "rappers", "sogras", "jogos", "mangás", "animes", 
			"filmes", "séries", "roupas", "casas", "ruas", "políticos", "palhaços"};
	
	String[] wordsPTBR2 = {"criado(a)s", "vendido(a)s", "otimizado(a)s", "lobotomizado(a)s", 
			"jogado(a)s", "inteligentes", "corajoso(a)s", "burro(a)s", "caro(a)s", "barato(a)s",
			"bondoso(a)s", "malígno(a)s", "desconfiado(a)s", "chateado(a)s", "gordo(a)s", "magro(a)s",
			"alto(a)s", "baixo(a)s", "estudioso(a)s", "preguiçoso(a)s", "trabalhadore(a)s"};
	
	String[] wordsPTBR3 = {"em curitiba", "em florianópolis", "em porto alegre", "em são paulo", 
			"no rio de janeiro", "em belo horizonte", "em vitória", "em cuiabá", "em goiânia", 
			"em brasília", "em campo grande", "em salvador", "em aracajú", "em maceió", "em recife",
			"em joão pessoa", "em natal", "em fortaleza", "em teresina", "em são luís", "em belém",
			"em manaus", "em porto velho", "em palmas", "em macapá", "em boa vista", "em rio branco"};
	
	String[] wordsEN1 = {"good", "bad", "ugly", "pretty", "soft", "hard", "evil", "merciful",
			"dumb", "smart", "tall", "short", "fat", "skinny", "brave", "proud", "lucky", "jolly",
			"fresh", "flat", "weird", "regular", "creepy", "big", "small", "foolish", "delicious",
			"hungry", "fair"};
	
	String[] wordsEN2 = {"programmers", "software", "students", "teachers", "codes", "dogs", "cats",
			"monkeys", "robots", "chairs", "tables", "capybaras", "machines", "cellphones", "hoods",
			"cops", "rappers", "grandmas", "games", "manga", "anime", "movies", "series", "clothes",
			"houses", "streets", "politicians", "clowns"};
	
	String[] wordsEN3 = {"in brazil", "in the usa", "in france", "in germany", "in spain", 
			"in portugal", "in argentina", "in china", "in japan", "in north korea", "in australia",
			"in sweden", "in thailand", "in mexico", "in peru", "in egypt", "in morocco", "in iraq",
			"in india", "in indonesia", "in new zealand", "in venezuela", "in guatemala", "in iran",
			"in norway", "in italy", "in england", "in scotland", "in ireland"};
	
	JTextField text;
	
	Application(String lang) {
		
		if (lang == "pt-br") {
			
			newGamePTBR();
		}
		else if (lang == "en") {
			
			newGameEN();
		}
	}
	
	public void newGamePTBR() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Phrase-O-Matic");
		this.setLayout(new BorderLayout());
		this.setLocation(460, 120);
		this.setResizable(false);
		this.setSize(400, 500);
		
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(100, 90));
		panel1.setLayout(new FlowLayout());
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		
		JLabel label1 = new JLabel("Phrase-O-Matic - Gerador de frases");
		label1.setFont(new Font("Consolas", Font.BOLD, 19));
		
		JLabel label2 = new JLabel("Nós precisamos de");
		label2.setFont(new Font("Consolas", Font.BOLD, 22));
		
		text = new JTextField();
		text.setEditable(false);
		text.setFont(new Font("Consolas", Font.PLAIN, 15));
		text.setPreferredSize(new Dimension(360, 30));
		
		buttonGeneratePTBR = new JButton("Gerar frase");
		buttonGeneratePTBR.setFocusable(false);
		buttonGeneratePTBR.setPreferredSize(new Dimension(100, 40));
		buttonGeneratePTBR.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonGeneratePTBR.addActionListener(this);
		
		buttonBack = new JButton("Selecionar idioma");
		buttonBack.setPreferredSize(new Dimension(140, 20));
		buttonBack.setFocusable(false);
		buttonBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonBack.addActionListener(this);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		panel1.add(label1);
		panel1.add(buttonBack);
		
		panel2.add(label2);
		panel2.add(text);
		panel2.add(buttonGeneratePTBR);
		
		this.setVisible(true);
	}
	
	public void newGameEN() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Phrase-O-Matic");
		this.setLayout(new BorderLayout());
		this.setLocation(460, 120);
		this.setResizable(false);
		this.setSize(400, 500);
		
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(100, 90));
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		
		JLabel label1 = new JLabel("Phrase-O-Matic - Phrase generator");
		label1.setFont(new Font("Consolas", Font.BOLD, 19));
		
		JLabel label2 = new JLabel("What we need is");
		label2.setFont(new Font("Consolas", Font.BOLD, 22));
		
		text = new JTextField();
		text.setEditable(false);
		text.setFont(new Font("Consolas",Font.PLAIN,15));
		text.setPreferredSize(new Dimension(360, 30));
		
		buttonGenerateEN = new JButton("Generate phrase");
		buttonGenerateEN.setFocusable(false);
		buttonGenerateEN.setPreferredSize(new Dimension(130, 40));
		buttonGenerateEN.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonGenerateEN.addActionListener(this);
		
		buttonBack = new JButton("Select language");
		buttonBack.setPreferredSize(new Dimension(140, 20));
		buttonBack.setFocusable(false);
		buttonBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonBack.addActionListener(this);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		panel1.add(label1);
		panel1.add(buttonBack, BorderLayout.SOUTH);
		
		panel2.add(label2);
		panel2.add(text);
		panel2.add(buttonGenerateEN);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == buttonBack) {
			
			new Launcher();
			this.dispose();
		}
		
		else if (e.getSource() == buttonGeneratePTBR) {
			
			int length1 = wordsPTBR1.length;
			int length2 = wordsPTBR2.length;
			int length3 = wordsPTBR3.length;
			
			int random1 = (int) (Math.random() * length1);
			int random2 = (int) (Math.random() * length2);
			int random3 = (int) (Math.random() * length3);
			
			String randomPhrase = wordsPTBR1[random1] + " " + wordsPTBR2[random2] + " " 
			+ wordsPTBR3[random3];
			
			text.setText(randomPhrase);
		}
		
		else if (e.getSource() == buttonGenerateEN) {
			
			int length1 = wordsEN1.length;
			int length2 = wordsEN2.length;
			int length3 = wordsEN3.length;
			
			int random1 = (int) (Math.random() * length1);
			int random2 = (int) (Math.random() * length2);
			int random3 = (int) (Math.random() * length3);
			
			String randomPhrase = wordsEN1[random1] + " " + wordsEN2[random2] + " " 
			+ wordsEN3[random3];
			
			text.setText(randomPhrase);
		}
	}
}