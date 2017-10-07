package burp;

import java.awt.Component;
import secarma.DemoExtender;
import secarma.DemoExtenderGui;

/**
 * Copyright 2017 Secarma Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * @author Cornerpirate
 */
public class BurpExtender implements IBurpExtender, ITab {

    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        DemoExtender.callbacks = callbacks;
        // set our extension name
        callbacks.setExtensionName(DemoExtender.extensionName);
        DemoExtender.demoExtenderGui = new DemoExtenderGui();
        callbacks.addSuiteTab(this);
    }

    @Override
    public String getTabCaption() {
        return DemoExtender.extensionName;
    }

    @Override
    public Component getUiComponent() {
        return DemoExtender.demoExtenderGui;
    }
}
