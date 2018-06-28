package com.groupdocs.parser.examples.TextExtractors;

import com.groupdocs.parser.PdfTextExtractor;
import com.groupdocs.parser.examples.Common;

public class PDFDocuments {
	// ExStart:SourcePDFDocumentFilePath
	private final static String FILE_PATH = "sample.pdf";
	// ExEnd:SourcePDFDocumentFilePath

	/**
	 * Extracts whole text from a document.
	 * 
	 */
	public static void extractTextAsWhole() {
		try {
			// ExStart:extractTextAsWholePdfTextExtractor
			// Create a text extractor for Portable Document Format (PDF)
			// documents
			try (PdfTextExtractor extractor = new PdfTextExtractor(Common.mapSourceFilePath(FILE_PATH))) {
				// Extract a text and print it to the console
				System.out.println(extractor.extractAll());
			}
			// ExEnd:extractTextAsWholePdfTextExtractor
		} catch (Exception exp) {
			System.out.println("Exception: " + exp.getMessage());
			exp.printStackTrace();
		}
	}

	/**
	 * Extracts text by lines from a document.
	 * 
	 */
	public static void extractTextByLines() {
		try {
			// ExStart:extractTextByLinesPdfTextExtractor
			// Create a text extractor for Portable Document Format documents
			try (PdfTextExtractor extractor = new PdfTextExtractor(Common.mapSourceFilePath(FILE_PATH))) {
				// Extract a line of the text
				String line = extractor.extractLine();
				// If the line is null, then the end of the file is reached
				while (line != null) {
					// Print a line to the console
					System.out.println(line);
					// Extract another line
					line = extractor.extractLine();
				}
			}
			// ExEnd:extractTextByLinesPdfTextExtractor
		} catch (Exception exp) {
			System.out.println("Exception: " + exp.getMessage());
			exp.printStackTrace();
		}
	}

}