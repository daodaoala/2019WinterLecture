import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MultiChatUI extends JFrame implements Runnable {
  
    private JPanel loginPanel;
    protected  JButton loginButton;
    private JLabel inLabel;
    protected  JLabel outLabel;  
    protected  JTextField idInput;  
    private JPanel logoutPanel;
    protected  JButton logoutButton;
    private JPanel msgPanel;
    protected JTextField msgInput;
    protected JButton exitButton;
    protected  Container tab;
    protected  CardLayout cardLayout;
    protected  JTextArea msgOut;
    protected String id;
    public MultiChatUI(){
       
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("17013136 Multi Chat");
        setLayout(new BorderLayout());
        setSize(550,550);
      
        loginPanel = new JPanel();   
        loginPanel.setLayout(new BorderLayout());      
        idInput = new JTextField(15);
        loginButton = new JButton("로그인");        
        inLabel = new JLabel("대화명");
        loginPanel.add(inLabel,BorderLayout.WEST);
        loginPanel.add(idInput,BorderLayout.CENTER);
        loginPanel.add(loginButton,BorderLayout.EAST);
        
        logoutPanel = new JPanel();
        logoutPanel.setLayout(new BorderLayout());
        outLabel = new JLabel();
        logoutButton = new JButton("로그아웃");
        logoutPanel.add(outLabel,BorderLayout.CENTER);
        logoutPanel.add(logoutButton,BorderLayout.EAST);

        msgPanel = new JPanel();
        msgPanel.setLayout(new BorderLayout());
        msgInput = new JTextField();

        exitButton = new JButton("종료");
        msgPanel.add(msgInput,BorderLayout.CENTER);
        msgPanel.add(exitButton,BorderLayout.EAST);
        add(msgPanel,BorderLayout.SOUTH);

        tab = new JPanel();
        cardLayout = new CardLayout();
        tab.setLayout(cardLayout);
        tab.add(loginPanel,Constants.LOGIN_TXT);
        tab.add(logoutPanel,Constants.LOGOUT_TXT);
        add(tab,BorderLayout.NORTH);

        msgOut = new JTextArea("",10,30);
        msgOut.setEditable(false);

        JScrollPane jsp = new JScrollPane(msgOut,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(jsp,BorderLayout.CENTER);

        setVisible(true);
    }

    public void addButtonActionListener(ActionListener listener){
    
        logoutButton.addActionListener(listener);
        loginButton.addActionListener(listener);
        exitButton.addActionListener(listener);
        msgInput.addActionListener(listener);
    }

    @Override
    public void run() {

    }
}
