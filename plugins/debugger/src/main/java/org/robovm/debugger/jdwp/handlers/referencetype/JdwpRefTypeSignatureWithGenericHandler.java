/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.state.VmDebuggerState;

/**
 * @author Demyan Kimitsa
 * Returns the JNI signature of a reference type along with the generic signature if there is one.
 */
public class JdwpRefTypeSignatureWithGenericHandler extends JdwpRefTypeSignatureHandler {

    public JdwpRefTypeSignatureWithGenericHandler(VmDebuggerState state) {
        super(state);
    }

    @Override
    protected String getGenericSignature() {
        // return empty string just to have this string to be reported
        return "";
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 13;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).SignatureWithGeneric(13)";
    }

}
