package mycode;

import java.io.IOException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import socialNetworkPackage.Person;
import socialNetworkPackage.SocialNetwork;
import socialNetworkPackage.SocialNetworkPackagePackage;

public class FixModel {

	public static final String MODEL_MODEL_OUTPUT_XMI = "model/model-output.xmi";
	public static final String MODEL_MODEL_INPUT_XMI = "model/model-input.xmi";
	
	/**
	 * The three magic lines.
	 */
	public static void init() {
		SocialNetworkPackagePackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}

	public static Resource createResource(ResourceSet resSet, URI uri) {
	    Resource resource = resSet.createResource(uri);
	    return resource;
	}
	
	public static  Resource loadResource(ResourceSet resSet, URI uri) {
	    Resource resource = resSet.getResource(uri, true);
	    return resource;
	}
	
	public static void main(String[] args) throws IOException {
		// initialize
		init();
		
		// Load the model and copy
		ResourceSet resSet = new ResourceSetImpl();
		Resource modelInput = loadResource(resSet, URI.createFileURI(MODEL_MODEL_INPUT_XMI));
		SocialNetwork sn = (SocialNetwork) modelInput.getContents().get(0);
		
		// Process and update the model
		pocessModel(sn);
		
		// Save the updated model
		Resource modelOutput = createResource(resSet, URI.createFileURI(MODEL_MODEL_OUTPUT_XMI));
		modelOutput.getContents().add(sn);
		modelOutput.save(null);
	}

	/**
	 * Assigns a value for each attribute in a social network
	 * @param sn
	 */
	public static void pocessModel(SocialNetwork sn) {
		// If you need an iterator for all objects in sn recursively,
		// you can use the following method:
		
		for(EAttribute attribute : sn.eClass().getEAllAttributes()) {
	          // Get the attribute name and value for the current object
  		Object value = sn.eGet(attribute);
	          // Check if the attribute value is empty/null and set a default value
	          if (value == null || value == attribute.getDefaultValue()) {
	        	 // System.out.println(attribute.getName());
	        	  sn.eSet(attribute, "undefined");
		
	          }}
		
		
		// sn.eAllContents()
		 TreeIterator<EObject> iterator = EcoreUtil.getAllContents(sn, true);
		    // Iterate over all objects and their attributes recursively
		    while (iterator.hasNext()) {
		        EObject obj = iterator.next();
		        	for(EAttribute attribute : obj.eClass().getEAllAttributes()) {
				          // Get the attribute name and value for the current object
		        		Object value = obj.eGet(attribute);
				          // Check if the attribute value is empty/null and set a default value
				          if (value == null || value == attribute.getDefaultValue()) {
				        	 // System.out.println(attribute.getName());
				        	  obj.eSet(attribute, "undefined");
				        }
				      }
				    }
			}
		
	}
