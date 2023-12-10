package com.rayen.boissona.RESTController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rayen.boissona.entities.Type;
import com.rayen.boissona.repos.TypeRepository;
@RestController
@RequestMapping("/api/type")
@CrossOrigin("*")
public class TypeRESTController {

    @Autowired
    TypeRepository typeRepository;
    @RequestMapping(method=RequestMethod.GET)
    public List<Type> getAllType()
    {
        return typeRepository.findAll();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Type getTypesById(@PathVariable("id") Long id) {
        return typeRepository.findById(id).get();
    }
}
