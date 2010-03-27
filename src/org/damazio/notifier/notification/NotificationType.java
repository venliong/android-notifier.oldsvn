package org.damazio.notifier.notification;

/**
 * Enum for the type of notification.
 *
 * @author rdamazio
 */
public enum NotificationType {
  /** Phone ringing. */
  RING,
  /** SMS received. */
  SMS,
  /** MMS received. */
  MMS,
  /** Battery status change. */
  BATTERY,
  /** Test notification. */
  PING;
}