import java.awt.Frame;
import java.awt.Scrollbar;

class ScrollbarExample{
ScrollbarExample(){
		Frame f=new Frame("Scrollbar Example");
		Scrollbar s=new Scrollbar();
		s.setBounds(100,100,50,100);
		f.add(s);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
}
}

public class PopupMenuExample1 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		new ScrollbarExample();
	}

}
