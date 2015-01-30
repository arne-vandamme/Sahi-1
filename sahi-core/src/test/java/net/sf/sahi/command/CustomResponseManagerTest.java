package net.sf.sahi.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Sahi - Web Automation and Test Tool
 * <p/>
 * Copyright  2006  V Narayan Raman
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class CustomResponseManagerTest {

  @Test
  public void testGetCommand() {
    MockResponder mockResponder = new MockResponder();
    mockResponder.add(".*sahipro[.]com.*", "net.sf.sahi.Test_test");
    String command = mockResponder.getCommand("http://www.sahipro.com");
    assertEquals("net.sf.sahi.Test_test", command);
  }

}
