/*
 * All content copyright Terracotta, Inc., unless otherwise indicated. All rights reserved.
 */

package com.tc.objectserver.event;

import com.tc.object.ObjectID;
import com.tc.objectserver.impl.SamplingType;
import com.tc.objectserver.managedobject.CDSMValue;
import com.tc.server.ServerEvent;
import com.tc.server.ServerEventType;

import java.util.List;

/**
 * Records all cache modifications and maps keys to actual values
 * omiting intermediate object id.
 *
 * @author Eugene Shelestovich
 */
public interface MutationEventPublisher {

  /**
   * This method records an <code>AdvancedServerEvent</code>.
   */
  void publishEvent(ServerEventType type, Object key, CDSMValue value, String cacheName);

  void setBytesForObjectID(ObjectID objectId, byte[] value);
}
