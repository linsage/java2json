package com.linsage.menu;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.linsage.Java2JsonAction;

public class ToggleCommentAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        Java2JsonAction.isShowComment = !Java2JsonAction.isShowComment;
        e.getPresentation().setIcon(Java2JsonAction.isShowComment ? AllIcons.Actions.Checked : null);
    }
}
