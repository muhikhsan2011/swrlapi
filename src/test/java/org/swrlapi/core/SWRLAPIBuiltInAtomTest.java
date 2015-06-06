package org.swrlapi.core;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.swrlapi.builtins.arguments.SWRLBuiltInArgument;
import org.swrlapi.factory.SWRLAPIFactory;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * @see SWRLAPIBuiltInAtom
 */
public class SWRLAPIBuiltInAtomTest
{
	private String ruleName = "name";
	private List<SWRLBuiltInArgument> arguments = new ArrayList<>();
	private IRI builtInIRI = IRI.create("http://www.w3.org/2003/11/swrlb#add");
	private String builtInName = "swrlb:add";
	private SWRLAPIBuiltInAtom atom;

	@Before public void setUp() throws OWLOntologyCreationException
	{
		this.atom = SWRLAPIFactory.createSWRLAPIBuiltInAtom(ruleName, builtInIRI, builtInName, arguments);
	}

	@Test public void testGetRuleName() throws Exception
	{
		assertEquals(atom.getRuleName(), ruleName);
	}

	@Test public void testGetBuiltInPrefixedName() throws Exception
	{
		assertEquals(atom.getBuiltInPrefixedName(), builtInName);
	}

	@Test public void testGetBuiltInIRI() throws Exception
	{
		assertEquals(atom.getBuiltInIRI(), builtInIRI);
	}
}