package com.vladsch.flexmark.ext.zzzzzz.internal;

import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.ext.zzzzzz.Zzzzzz;
import com.vladsch.flexmark.internal.Delimiter;
import com.vladsch.flexmark.parser.InlineParser;
import com.vladsch.flexmark.parser.delimiter.DelimiterProcessor;
import com.vladsch.flexmark.parser.delimiter.DelimiterRun;
import com.vladsch.flexmark.util.sequence.BasedSequence;

public class ZzzzzzDelimiterProcessor implements DelimiterProcessor {

    @Override
    public char getOpeningCharacter() {
        return ':';
    }

    @Override
    public char getClosingCharacter() {
        return ':';
    }

    @Override
    public int getMinLength() {
        return 1;
    }

    @Override
    public boolean canBeOpener(boolean leftFlanking, boolean rightFlanking, boolean beforeIsPunctuation, boolean afterIsPunctuation, boolean beforeIsWhitespace, boolean afterIsWhiteSpace) {
        return leftFlanking;
    }

    @Override
    public boolean canBeCloser(boolean leftFlanking, boolean rightFlanking, boolean beforeIsPunctuation, boolean afterIsPunctuation, boolean beforeIsWhitespace, boolean afterIsWhiteSpace) {
        return rightFlanking;
    }

    @Override
    public int getDelimiterUse(DelimiterRun opener, DelimiterRun closer) {
        if (opener.length() >= 1 && closer.length() >= 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Node unmatchedDelimiterNode(InlineParser inlineParser, final DelimiterRun delimiter) {
        return null;
    }

    @Override
    public void process(Delimiter opener, Delimiter closer, int delimitersUsed) {
        // Normal case, wrap nodes between delimiters in strikethrough.
        Zzzzzz zzzzzz = new Zzzzzz(opener.getTailChars(delimitersUsed), BasedSequence.NULL, closer.getLeadChars(delimitersUsed));
        opener.moveNodesBetweenDelimitersTo(zzzzzz, closer);
    }
}
