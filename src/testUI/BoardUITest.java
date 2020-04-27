package testUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Battalion;
import model.Board;
import model.Coordinate;
import model.Dimensionn;
import view.BoardUI;
import view.File;
import view.info.BoardUIInfo;
import view.info.FileInfo;

public class BoardUITest extends JFrame {

	private JPanel contentPane;
	private Dimensionn dimensionn;
	private BoardUI boardUI;
	private JPanel[][] files;
	BoardUIInfo boardUIinfo;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardUITest frame = new BoardUITest();
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
	public BoardUITest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		MouseAdapter mouseAdapter= (new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				JPanel panel= (JPanel) e.getSource();
				panel.add(new File(new FileInfo("/images/ligera.png", 30, 40, 50, 60, 70, 80, 90, true, Color.BLUE, Color.BLACK)), BorderLayout.CENTER);
//				panel.setBackground(Color.BLUE);
				setContentPane(panel);
//				int x=e.getX();
//				int y=e.getY();
//				files[x][y]=panel;
//				boardUIinfo.getFiles(files);
//				boardUI.updateBoardUI(boardUIinfo);
			}
		});
		Dimensionn dimensionn= new Dimensionn(6, 12);
		Board board= new Board(dimensionn);
		board.insert(new Battalion(3, model.Type.archery), new Coordinate(4, 4));
		boardUIinfo= new BoardUIInfo(board);
		boardUI = new BoardUI(dimensionn, mouseAdapter, boardUIinfo);
		contentPane.add(boardUI, BorderLayout.CENTER);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
	}

}
