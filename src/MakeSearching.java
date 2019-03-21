import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.project.Project;

import javax.swing.*;
import java.util.Objects;

public class MakeSearching extends AnAction {

    public String choice;

    public MakeSearching(){};

    @Override
    public void actionPerformed(AnActionEvent e) {
        CaretModel caretModel = Objects.requireNonNull(e.getData(LangDataKeys.EDITOR)).getCaretModel();
        Caret caret = caretModel.getCurrentCaret();
        String textForSearching = caret.getSelectedText();

        BrowserUtil.browse(choice + textForSearching);
    }
}
