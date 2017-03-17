package com.ait.mydistance1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ait.mydistance1.ConversionUtil;
import com.ait.mydistance1.DistanceServlet;

/**
 * Servlet implementation class DistanceServlet
 */
public class DistanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger(DistanceServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DistanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double convertVal = 0; 
		double distanceProvided =Double.parseDouble(request.getParameter("distance")); 
		String distanceIn=request.getParameter("distIn"); 
		String convertTo=request.getParameter("convert"); 
		log.debug("Request Parameters ==>"+"Distance"+distanceProvided+distanceIn+" Conversion Unit"+convertTo ); 
		ConversionUtil conversion= new ConversionUtil(); 
		if(distanceIn.equals("km") && convertTo.equals("yd")){ 
			convertVal=conversion.convertkmToYard(distanceProvided); 
			} 
		if(distanceIn.equals("m") && convertTo.equals("yd")){
			convertVal=conversion.convertMtoYard(distanceProvided);
		}
		if(distanceIn.equals("km") && convertTo.equals("mi")){ 
			convertVal=conversion.convertKMToMile(distanceProvided); 
			} 
		if(distanceIn.equals("m") && convertTo.equals("mi")){ 
			convertVal=conversion.convertMToMile(distanceProvided); 
			} 
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		out.print("The converted value is "+convertVal); 
		out.flush(); 
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
