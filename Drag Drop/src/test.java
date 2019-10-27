import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.Component;
public class test  implements MouseListener, MouseMotionListener {

 public static	JLabel pic1=new JLabel("HI");
	
	private int x,y;
	
	public void Movement(Component... pns) {
		for(Component panel : pns) {
			panel.addMouseListener(this);
			panel.addMouseMotionListener(this);
		
		}
	}
			


	@Override
	public void mouseDragged(MouseEvent e) {
		e.getComponent().setLocation((e.getX()+e.getComponent().getX())-x, (e.getY()+e.getComponent().getY())-y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x=e.getX();
		y=e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) 
	{
		
		test mv =new test();
	}
}
