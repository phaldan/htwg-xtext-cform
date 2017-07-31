/*
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.idea.lang.psi.impl;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import de.htwg.zeta.xtext.idea.lang.CalculatorFormFileType;
import de.htwg.zeta.xtext.idea.lang.CalculatorFormLanguage;
import org.eclipse.xtext.psi.impl.BaseXtextFile;

public final class CalculatorFormFileImpl extends BaseXtextFile {

	public CalculatorFormFileImpl(FileViewProvider viewProvider) {
		super(viewProvider, CalculatorFormLanguage.INSTANCE);
	}

	@Override
	public FileType getFileType() {
		return CalculatorFormFileType.INSTANCE;
	}
}