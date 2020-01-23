package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IClienteDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Factura;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

	@Override
	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente fetchByIdWithFacturas(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findByNombre(String term) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveFactura(Factura factura) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto findProductoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura findFacturaById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFactura(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Factura fetchFacturaByIdWithClienteWhithItemFacturaWithProducto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
