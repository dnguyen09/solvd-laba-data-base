package com.solvd.laba.lab2.xml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XMLValidator {
    private static final Logger LOGGER = LogManager.getLogger(XMLValidator.class);

    public void validate(String xmlFilePath, String xsdFilePath) {
        try {
            //create a SchemaFactory and specify XML schema language
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            //load the XSD schema
            Schema schema = factory.newSchema(new File(xsdFilePath));

            //XML file for validation
            Source xmlSource = new StreamSource(new File(xmlFilePath));

            //create a Validator instance from the schema
            Validator validator = schema.newValidator();

            //create XMLErrorHandler to check for any validation error
            XMLErrorHandler xmlErrorHandler = new XMLErrorHandler();

            //set xmlErrorHandler to validator
            validator.setErrorHandler(xmlErrorHandler);

            // Perform validation
            validator.validate(xmlSource);

            //print error if any error occur
            if (xmlErrorHandler.hasError()) {
                LOGGER.info("Validation error occurred!");
            } else {
                LOGGER.info("Validation successful. The XML file is valid.");
            }

        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    private static class XMLErrorHandler implements ErrorHandler {
        private static final Logger LOGGER = LogManager.getLogger(XMLErrorHandler.class);

        private boolean hasError = false;

        @Override
        public void warning(SAXParseException exception) throws SAXException {
            LOGGER.warn("Warning: " + exception.getMessage());
        }

        @Override
        public void error(SAXParseException exception) throws SAXException {
            LOGGER.error("Error : " + exception.getMessage());
            hasError = true;
        }

        @Override
        public void fatalError(SAXParseException exception) throws SAXException {
            LOGGER.fatal("Fatal error: " + exception.getMessage());
        }

        public boolean hasError() {
            return hasError;
        }
    }
}
