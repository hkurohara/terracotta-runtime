/*
 * All content copyright (c) 2003-2008 Terracotta, Inc., except as may otherwise be noted in a separate copyright notice.  All rights reserved.
 */
package com.tc.objectserver.api;

import java.util.Map;

public interface ObjectInstanceMonitor {

  void instanceCreated(String type);

  void instanceDestroyed(String type);

  Map getInstanceCounts();

}
