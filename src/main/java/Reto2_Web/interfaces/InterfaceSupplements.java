
package Reto2_Web.interfaces;


import Reto2_Web.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author LUIS JULIAN ORTIZ HEREDIA
 */
public interface InterfaceSupplements extends MongoRepository<Supplements, String> {
    
}
