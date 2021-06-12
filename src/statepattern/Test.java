/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author Felipe
 */
 public class Test
 {
 	public static void main( String arg[] )
 	{
 		try
 		{
 			State state = new ConcreteStateA();
 			Context context = new Context();
 			context.setState( state ); 
 			context.request();
 		}
 		catch( Exception e ) 
 		{
 			e.printStackTrace();
 		}
 	}
 }