package com.mycompany.cuentas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.cuentas.dao.CuentaDAO;
import com.mycompany.cuentas.modelo.Cuenta;

  
@Controller
public class CuentaController {
	
	@Autowired
	private CuentaDAO cuentaDao;
	
	public CuentaDAO getCuentaDao() {
		return cuentaDao;
	} 
//	@Autowired
	public void setCuentaDao(CuentaDAO cuentaDao) {
		this.cuentaDao = cuentaDao;
	}
	
//	@Autowired
//	public CuentaController(CuentaDAO cuentaDao) {
//		this.cuentaDao = cuentaDao;
//	}

	@RequestMapping("/form")
	public String initFormulario(){
		return "cuenta/formulario";
	}
	
	
	
	@RequestMapping("/agregarCuenta")
	public String guardarFormulario(Cuenta cuenta){
		System.out.println("Se guarda la cuenta");
		System.out.println("Cuenta:"+cuenta.getDescripcion());
//		CuentaDAO dao = new CuentaDAO();
		
		cuentaDao.agregar(cuenta);
		 
		
		return "cuenta/cuenta-agregada";
	}
	@RequestMapping(value="/listarCuentas")
	public String listar(Model m){
		System.out.println("elista");
//		CuentaDAO dao = new CuentaDAO();
		List<Cuenta> cuentas = cuentaDao.listar();
		m.addAttribute("cuentas", cuentas);
		 
		System.out.println(cuentas.size());
		
//		ModelAndView mav = new ModelAndView("cuenta/lista");
//		mav.addObject("cuentas", cuentas);
//		return mav;
		
	
		return "cuenta/lista";
	}

	@RequestMapping("/eliminarCuenta")
	public String remove(Cuenta cuenta) {
//		CuentaDAO dao = new CuentaDAO();
		cuentaDao.eliminar(cuenta);
//		forward:listarCuentas
//		redirect:listarCuentas
		return "forward:listarCuentas";
	}	

	@RequestMapping("/muestraCuenta")
	public String muestra(Long id, Model model) {
		System.out.println("muestra");
//		CuentaDAO dao = new CuentaDAO();
		model.addAttribute("cuenta", cuentaDao.buscarPorId(id));
		return "cuenta/muestra";
	}
//	@DateTimeFormat(pattern="dd/MM/yyyy") 
//	private Calendar fechaPago;
	
//	@RequestMapping(value="/modificarCuenta",method = RequestMethod.POST)
	@RequestMapping( "/modificarCuenta" )
	public String modificar(Cuenta cuenta) {
		System.out.println("modifica");
//		CuentaDAO dao = new CuentaDAO();
		cuentaDao.modificar(cuenta);
		return "redirect:listarCuentas";
	}



	
 
	
	
	
	

	
}
