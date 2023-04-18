package controller;


import model.NPCS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Controller", "/adicionandoNPC", "/mostrarLista"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
     static List<NPCS> listaNPCS = new ArrayList<>();
     static int qtdeNPCS = 0;
     
    public Controller() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listaNPC", listaNPCS);
		RequestDispatcher rd = request.getRequestDispatcher("/listaNPC.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		if (action.equals("/adicionandoNPC")) {
			gerandoNPC(request, response);
			response.sendRedirect("menu.jsp");
		}else if (action.equals("/mostrarLista")) {
			doGet(request, response);
		}
	}
	protected void gerandoNPC(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		NPCS npc = new NPCS();
		npc.statusNPC();
		listaNPCS.add(npc);
		qtdeNPCS++;
		
	}

}
