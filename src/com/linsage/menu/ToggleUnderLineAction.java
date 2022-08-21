package com.linsage.menu;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.linsage.Java2JsonAction;

public class ToggleUnderLineAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        Java2JsonAction.isUnderlineModel = !Java2JsonAction.isUnderlineModel;
        e.getPresentation().setIcon(Java2JsonAction.isUnderlineModel ? AllIcons.Actions.Checked : AllIcons.Actions.Cancel);
    }
}
